package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppBlockProps {

  def apply(
    setupScriptDetails: software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty,
    name: String,
    sourceS3Location: software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty,
    displayName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.appstream.CfnAppBlockProps =
    (new software.amazon.awscdk.services.appstream.CfnAppBlockProps.Builder)
      .setupScriptDetails(setupScriptDetails)
      .name(name)
      .sourceS3Location(sourceS3Location)
      .displayName(displayName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
