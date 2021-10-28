package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomResourceProps {

  def apply(
    serviceToken: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps =
    (new software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps.Builder)
      .serviceToken(serviceToken.orNull)
      .build()
}
