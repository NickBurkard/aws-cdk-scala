package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessKeyProps {

  def apply(
    serial: Option[Number] = None,
    status: Option[String] = None,
    userName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnAccessKeyProps =
    (new software.amazon.awscdk.services.iam.CfnAccessKeyProps.Builder)
      .serial(serial.orNull)
      .status(status.orNull)
      .userName(userName.orNull)
      .build()
}
