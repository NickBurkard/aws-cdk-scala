package io.burkard.cdk.services.stepfunctions

sealed abstract class IntegrationPattern(val underlying: software.amazon.awscdk.services.stepfunctions.IntegrationPattern)
  extends Product
    with Serializable

object IntegrationPattern {
  implicit def toAws(value: IntegrationPattern): software.amazon.awscdk.services.stepfunctions.IntegrationPattern =
    Option(value).map(_.underlying).orNull

  case object RequestResponse
    extends IntegrationPattern(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.REQUEST_RESPONSE)

  case object RunJob
    extends IntegrationPattern(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.RUN_JOB)

  case object WaitForTaskToken
    extends IntegrationPattern(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.WAIT_FOR_TASK_TOKEN)
}
