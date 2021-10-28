package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCustomResourceProps {

  def apply(
    serviceToken: Option[String] = None
  ): software.amazon.awscdk.CfnCustomResourceProps =
    (new software.amazon.awscdk.CfnCustomResourceProps.Builder)
      .serviceToken(serviceToken.orNull)
      .build()
}
