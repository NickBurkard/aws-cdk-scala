package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunLambdaTaskProps {

  def apply(
    qualifier: Option[String] = None,
    payload: Option[software.amazon.awscdk.services.stepfunctions.TaskInput] = None,
    invocationType: Option[software.amazon.awscdk.services.stepfunctions.tasks.InvocationType] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    clientContext: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunLambdaTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.RunLambdaTaskProps.Builder)
      .qualifier(qualifier.orNull)
      .payload(payload.orNull)
      .invocationType(invocationType.orNull)
      .integrationPattern(integrationPattern.orNull)
      .clientContext(clientContext.orNull)
      .build()
}
