package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AcceleratorProps {

  def apply(
    enabled: Option[Boolean] = None,
    acceleratorName: Option[String] = None
  ): software.amazon.awscdk.services.globalaccelerator.AcceleratorProps =
    (new software.amazon.awscdk.services.globalaccelerator.AcceleratorProps.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .acceleratorName(acceleratorName.orNull)
      .build()
}
