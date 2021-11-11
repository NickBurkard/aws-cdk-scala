package io.burkard.cdk.services.ec2

sealed abstract class InstanceClass(val underlying: software.amazon.awscdk.services.ec2.InstanceClass)
  extends Product
    with Serializable

object InstanceClass {
  implicit def toAws(value: InstanceClass): software.amazon.awscdk.services.ec2.InstanceClass =
    Option(value).map(_.underlying).orNull

  case object Standard3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD3)

  case object Standard4
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD4)

  case object Standard5
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD5)

  case object Standard5NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD5_NVME_DRIVE)

  case object Standard5Amd
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD5_AMD)

  case object Standard5AmdNvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD5_AMD_NVME_DRIVE)

  case object Memory3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY3)

  case object Memory4
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY4)

  case object Memory5
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5)

  case object Memory5HighPerformance
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_HIGH_PERFORMANCE)

  case object Memory5NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_NVME_DRIVE)

  case object Memory5NvmeDriveHighPerformance
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE)

  case object Memory5Amd
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_AMD)

  case object Memory5AmdNvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_AMD_NVME_DRIVE)

  case object Memory5EbsOptimized
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY5_EBS_OPTIMIZED)

  case object Memory6Graviton
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY6_GRAVITON)

  case object Memory6Graviton2NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY6_GRAVITON2_NVME_DRIVE)

  case object Compute3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE3)

  case object Compute4
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE4)

  case object Compute5
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE5)

  case object Compute6Intel
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE6_INTEL)

  case object Compute5NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE5_NVME_DRIVE)

  case object Compute5Amd
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE5_AMD)

  case object Compute5AmdNvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE5_AMD_NVME_DRIVE)

  case object Compute5HighPerformance
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE5_HIGH_PERFORMANCE)

  case object Compute6Graviton2
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE6_GRAVITON2)

  case object Compute6Graviton2NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE6_GRAVITON2_NVME_DRIVE)

  case object Compute6Graviton2HighNetworkBandwith
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.COMPUTE6_GRAVITON2_HIGH_NETWORK_BANDWITH)

  case object Storage2
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STORAGE2)

  case object StorageCompute1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STORAGE_COMPUTE_1)

  case object Io3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.IO3)

  case object Io3DenseNvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.IO3_DENSE_NVME_DRIVE)

  case object Burstable2
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.BURSTABLE2)

  case object Burstable3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.BURSTABLE3)

  case object Burstable3Amd
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.BURSTABLE3_AMD)

  case object Burstable4Graviton
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.BURSTABLE4_GRAVITON)

  case object MemoryIntensive1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY_INTENSIVE_1)

  case object MemoryIntensive1Extended
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY_INTENSIVE_1_EXTENDED)

  case object MemoryIntensive2Graviton2
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY_INTENSIVE_2_GRAVITON2)

  case object MemoryIntensive2Graviton2NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.MEMORY_INTENSIVE_2_GRAVITON2_NVME_DRIVE)

  case object Fpga1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.FPGA1)

  case object Graphics3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.GRAPHICS3)

  case object Graphics4NvmeDriveHighPerformance
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE)

  case object Parallel2
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.PARALLEL2)

  case object Parallel3
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.PARALLEL3)

  case object Parallel4
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.PARALLEL4)

  case object Arm1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.ARM1)

  case object Standard6Graviton
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD6_GRAVITON)

  case object Standard6Intel
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD6_INTEL)

  case object Standard6Graviton2NvmeDrive
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.STANDARD6_GRAVITON2_NVME_DRIVE)

  case object HighComputeMemory1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.HIGH_COMPUTE_MEMORY1)

  case object Inference1
    extends InstanceClass(software.amazon.awscdk.services.ec2.InstanceClass.INFERENCE1)
}
