package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SampleProperty {

  def apply(
    size: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnProject.SampleProperty =
    (new software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.Builder)
      .size(size.orNull)
      .`type`(`type`.orNull)
      .build()
}