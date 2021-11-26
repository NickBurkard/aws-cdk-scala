package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    name: String,
    appBlockArn: String,
    platforms: List[String],
    instanceFamilies: List[String],
    launchPath: String,
    iconS3Location: software.amazon.awscdk.services.appstream.CfnApplication.S3LocationProperty,
    displayName: Option[String] = None,
    attributesToDelete: Option[List[String]] = None,
    workingDirectory: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    launchParameters: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnApplicationProps =
    (new software.amazon.awscdk.services.appstream.CfnApplicationProps.Builder)
      .name(name)
      .appBlockArn(appBlockArn)
      .platforms(platforms.asJava)
      .instanceFamilies(instanceFamilies.asJava)
      .launchPath(launchPath)
      .iconS3Location(iconS3Location)
      .displayName(displayName.orNull)
      .attributesToDelete(attributesToDelete.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .launchParameters(launchParameters.orNull)
      .build()
}
