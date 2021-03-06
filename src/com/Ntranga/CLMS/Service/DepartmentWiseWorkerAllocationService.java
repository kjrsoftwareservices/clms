package com.Ntranga.CLMS.Service;

import java.util.Date;
import java.util.List;

import com.Ntranga.CLMS.vo.DepartmentwiseWorkerAllocationDetailsVo;

public interface DepartmentWiseWorkerAllocationService {

	public List<DepartmentwiseWorkerAllocationDetailsVo> WorkerAllocationDetailsId(Integer workerAllocationId);

	public Integer saveOrUpdateWorkerAllocationDetails(DepartmentwiseWorkerAllocationDetailsVo workerVo);

	public List<DepartmentwiseWorkerAllocationDetailsVo> DepartmentWiseWorkerAllocationGridDetails(String customerId,
			String companyId, String countryId, String departmentId, String locationId, String plannedOrAdhoc,
			String fromDate, String toDate);
}
