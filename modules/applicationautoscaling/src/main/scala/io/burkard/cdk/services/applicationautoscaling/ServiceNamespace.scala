package io.burkard.cdk.services.applicationautoscaling

sealed abstract class ServiceNamespace(val underlying: software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace)
  extends Product
    with Serializable

object ServiceNamespace {
  implicit def toAws(value: ServiceNamespace): software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace =
    Option(value).map(_.underlying).orNull

  case object Appstream
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.APPSTREAM)

  case object Comprehend
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.COMPREHEND)

  case object CustomResource
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.CUSTOM_RESOURCE)

  case object Dynamodb
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.DYNAMODB)

  case object Ec2
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.EC2)

  case object Ecs
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ECS)

  case object ElasticMapReduce
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.ELASTIC_MAP_REDUCE)

  case object Kafka
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.KAFKA)

  case object Lambda
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.LAMBDA)

  case object Rds
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.RDS)

  case object Sagemaker
    extends ServiceNamespace(software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace.SAGEMAKER)
}
