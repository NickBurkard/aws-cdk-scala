package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransferAccelerationUrlOptions {

  def apply(
    dualStack: Option[Boolean] = None
  ): software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions =
    (new software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions.Builder)
      .dualStack(dualStack.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
