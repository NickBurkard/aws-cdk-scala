package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JobCommandProperty {

  def apply(
    name: Option[String] = None,
    pythonVersion: Option[String] = None,
    scriptLocation: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty =
    (new software.amazon.awscdk.services.glue.CfnJob.JobCommandProperty.Builder)
      .name(name.orNull)
      .pythonVersion(pythonVersion.orNull)
      .scriptLocation(scriptLocation.orNull)
      .build()
}
