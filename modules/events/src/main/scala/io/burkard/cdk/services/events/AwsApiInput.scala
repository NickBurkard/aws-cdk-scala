package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsApiInput {

  def apply(
    service: Option[String] = None,
    apiVersion: Option[String] = None,
    catchErrorPattern: Option[String] = None,
    parameters: Option[AnyRef] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.events.targets.AwsApiInput =
    (new software.amazon.awscdk.services.events.targets.AwsApiInput.Builder)
      .service(service.orNull)
      .apiVersion(apiVersion.orNull)
      .catchErrorPattern(catchErrorPattern.orNull)
      .parameters(parameters.orNull)
      .action(action.orNull)
      .build()
}
