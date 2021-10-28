package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsApi {

  def apply(
    service: Option[String] = None,
    apiVersion: Option[String] = None,
    parameters: Option[AnyRef] = None,
    action: Option[String] = None,
    catchErrorPattern: Option[String] = None,
    policyStatement: Option[software.amazon.awscdk.services.iam.PolicyStatement] = None
  ): software.amazon.awscdk.services.events.targets.AwsApi =
    software.amazon.awscdk.services.events.targets.AwsApi.Builder
      .create()
      .service(service.orNull)
      .apiVersion(apiVersion.orNull)
      .parameters(parameters.orNull)
      .action(action.orNull)
      .catchErrorPattern(catchErrorPattern.orNull)
      .policyStatement(policyStatement.orNull)
      .build()
}
