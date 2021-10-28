package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JobSampleProperty {

  def apply(
    size: Option[Number] = None,
    mode: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty.Builder)
      .size(size.orNull)
      .mode(mode.orNull)
      .build()
}
