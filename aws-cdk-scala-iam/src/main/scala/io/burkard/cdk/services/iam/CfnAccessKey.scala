package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessKey {

  def apply(
    internalResourceId: String,
    serial: Option[Number] = None,
    status: Option[String] = None,
    userName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnAccessKey =
    software.amazon.awscdk.services.iam.CfnAccessKey.Builder
      .create(stackCtx, internalResourceId)
      .serial(serial.orNull)
      .status(status.orNull)
      .userName(userName.orNull)
      .build()
}
