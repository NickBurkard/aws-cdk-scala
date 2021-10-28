package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationConfigProperty {

  def apply(
    onFailure: Option[software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty] = None
  ): software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty.Builder)
      .onFailure(onFailure.orNull)
      .build()
}
