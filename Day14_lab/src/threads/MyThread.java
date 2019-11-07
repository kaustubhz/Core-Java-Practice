package threads;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Employee;
import static ioutils.IOOperation.*;

public class MyThread implements Runnable {

	private List<Employee> listEmps;

	public MyThread(List<Employee> listEmps) {
		super();
		this.listEmps = listEmps;

	}

	@Override
	public void run() {
		try {
			synchronized (listEmps) {
				System.out.println(Thread.currentThread()+" is on run");
				String threadName = Thread.currentThread().getName();
				
				if (threadName.equals("t1")) {
					Collections.sort(listEmps, new Comparator<Employee>() {

						@Override
						public int compare(Employee o1, Employee o2) {
							return o1.getEmpName().compareTo(o2.getEmpName());
						}

					});
				}

				else if (threadName.equals("t2"))
				{
					Collections.sort(listEmps, new Comparator<Employee>() {

						@Override
						public int compare(Employee o1, Employee o2) {
							return (int)(o1.getEmpSal()-(o2.getEmpSal()));
						}

					});

				}
				else
				{
					Collections.sort(listEmps, new Comparator<Employee>() {

						@Override
						public int compare(Employee o1, Employee o2) {
							return (o1.getHireDate().compareTo(o2.getHireDate()));
						}

					});
					
				}

					writeData(threadName.concat(".txt"), listEmps);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
