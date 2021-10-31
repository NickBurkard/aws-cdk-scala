package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SelfManagedEventSourceProperty {

  def apply(
    endpoints: Option[software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder)
      .endpoints(endpoints.orNull)
      .build()
}
