package io.burkard.cdk.services.stepfunctions


sealed abstract class ServiceIntegrationPattern(val underlying: software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern)
  extends Product
    with Serializable


object ServiceIntegrationPattern {
  implicit def toAws(value: ServiceIntegrationPattern): software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern =
    Option(value).map(_.underlying).orNull

  case object FireAndForget
    extends ServiceIntegrationPattern(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.FIRE_AND_FORGET)

  case object Sync
    extends ServiceIntegrationPattern(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.SYNC)

  case object WaitForTaskToken
    extends ServiceIntegrationPattern(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.WAIT_FOR_TASK_TOKEN)
}
