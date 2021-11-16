package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOptionGroup {

  def apply(
    internalResourceId: String,
    majorEngineVersion: String,
    engineName: String,
    optionConfigurations: List[_],
    optionGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnOptionGroup =
    software.amazon.awscdk.services.rds.CfnOptionGroup.Builder
      .create(stackCtx, internalResourceId)
      .majorEngineVersion(majorEngineVersion)
      .engineName(engineName)
      .optionConfigurations(optionConfigurations.asJava)
      .optionGroupDescription(optionGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
