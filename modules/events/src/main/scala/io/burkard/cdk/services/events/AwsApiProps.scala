package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsApiProps {

  def apply(
    service: Option[String] = None,
    apiVersion: Option[String] = None,
    parameters: Option[AnyRef] = None,
    action: Option[String] = None,
    catchErrorPattern: Option[String] = None,
    policyStatement: Option[software.amazon.awscdk.services.iam.PolicyStatement] = None
  ): software.amazon.awscdk.services.events.targets.AwsApiProps =
    (new software.amazon.awscdk.services.events.targets.AwsApiProps.Builder)
      .service(service.orNull)
      .apiVersion(apiVersion.orNull)
      .parameters(parameters.orNull)
      .action(action.orNull)
      .catchErrorPattern(catchErrorPattern.orNull)
      .policyStatement(policyStatement.orNull)
      .build()
}
