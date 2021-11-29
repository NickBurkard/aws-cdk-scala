package io.burkard.cdk.services.applicationautoscaling

sealed abstract class PredefinedMetric(val underlying: software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric)
  extends Product
    with Serializable

object PredefinedMetric {
  implicit def toAws(value: PredefinedMetric): software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric =
    Option(value).map(_.underlying).orNull

  case object AlbRequestCountPerTarget
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET)

  case object DyanmodbWriteCapacityUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYANMODB_WRITE_CAPACITY_UTILIZATION)

  case object DynamodbReadCapacityUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.DYNAMODB_READ_CAPACITY_UTILIZATION)

  case object Ec2SpotFleetRequestAverageCpuUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_CPU_UTILIZATION)

  case object Ec2SpotFleetRequestAverageNetworkIn
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_IN)

  case object Ec2SpotFleetRequestAverageNetworkOut
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.EC2_SPOT_FLEET_REQUEST_AVERAGE_NETWORK_OUT)

  case object EcsServiceAverageCpuUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_CPU_UTILIZATION)

  case object EcsServiceAverageMemoryUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.ECS_SERVICE_AVERAGE_MEMORY_UTILIZATION)

  case object KafkaBrokerStorageUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.KAFKA_BROKER_STORAGE_UTILIZATION)

  case object LambdaProvisionedConcurrencyUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION)

  case object RdsReaderAverageCpuUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_CPU_UTILIZATION)

  case object RdsReaderAverageDatabaseConnections
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.RDS_READER_AVERAGE_DATABASE_CONNECTIONS)

  case object SagemakerVariantInvocationsPerInstance
    extends PredefinedMetric(software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric.SAGEMAKER_VARIANT_INVOCATIONS_PER_INSTANCE)
}
