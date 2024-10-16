Hospitals
=========

## @RequestMapping("/hospitals")
## @GetMapping
	public ResponseEntity<ResponseStructure<Object>> findAllHospitals()
	
## @GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Object>> findHospitalById(@PathVariable int id)
	
## @PostMapping
	public ResponseEntity<ResponseStructure<Object>> saveHospitalDetails(@RequestBody Hospital h)

## @PutMapping 
	public ResponseEntity<ResponseStructure<Object>> updateHospitalDetails(@RequestParam int id , @RequestBody Hospital h)
	
## @DeleteMapping("/{id}")
	public ResponseEntity<ResponseStructure<Object>> deleteHospitalById(@PathVariable int id)

Department
==========
## @GetMapping("/dept/{hid}")
	public ResponseEntity<ResponseStructure<Object>> findAllDepartmentByHid(@PathVariable int hid)
## @PostMapping("/dept/{hid}")
	public ResponseEntity<ResponseStructure<Object>> saveDepartmentByHid(@PathVariable int hid,@RequestBody Department dept)
	
Doctors
========

## @PostMapping("/doctors/{hid}")
	public ResponseEntity<ResponseStructure<Object>> saveDoctor(@PathVariable int hid,@RequestBody Doctor doctor)

## @GetMapping("/doctors/{hid}")
	public ResponseEntity<ResponseStructure<Object>> findAllDoctorsbyHid(@PathVariable int hid)
	
## @PatchMapping("/doctors/{did}/{deptid}")
	public ResponseEntity<ResponseStructure<Object>> patchDoctorsbydidAndDeptId(@PathVariable int did,@PathVariable int deptid)