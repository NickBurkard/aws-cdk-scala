package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessKeyProps {

  def apply(
    userName: String,
    serial: Option[Number] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnAccessKeyProps =
    (new software.amazon.awscdk.services.iam.CfnAccessKeyProps.Builder)
      .userName(userName)
      .serial(serial.orNull)
      .status(status.orNull)
      .build()
}
