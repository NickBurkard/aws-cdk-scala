package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MavenReferenceProperty {

  def apply(
    artifactId: String,
    groupId: String,
    version: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty.Builder)
      .artifactId(artifactId)
      .groupId(groupId)
      .version(version)
      .build()
}
