package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SampleProperty {

  def apply(
    `type`: String,
    size: Option[Number] = None
  ): software.amazon.awscdk.services.databrew.CfnProject.SampleProperty =
    (new software.amazon.awscdk.services.databrew.CfnProject.SampleProperty.Builder)
      .`type`(`type`)
      .size(size.orNull)
      .build()
}
