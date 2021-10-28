package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Accelerator {

  def apply(
    internalResourceId: String,
    enabled: Option[Boolean] = None,
    acceleratorName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.globalaccelerator.Accelerator =
    software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder
      .create(stackCtx, internalResourceId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .acceleratorName(acceleratorName.orNull)
      .build()
}
