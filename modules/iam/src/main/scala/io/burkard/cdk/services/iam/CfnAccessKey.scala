package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessKey {

  def apply(
    internalResourceId: String,
    userName: String,
    serial: Option[Number] = None,
    status: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnAccessKey =
    software.amazon.awscdk.services.iam.CfnAccessKey.Builder
      .create(stackCtx, internalResourceId)
      .userName(userName)
      .serial(serial.orNull)
      .status(status.orNull)
      .build()
}
