package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MavenReferenceProperty {

  def apply(
    artifactId: Option[String] = None,
    groupId: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty.Builder)
      .artifactId(artifactId.orNull)
      .groupId(groupId.orNull)
      .version(version.orNull)
      .build()
}