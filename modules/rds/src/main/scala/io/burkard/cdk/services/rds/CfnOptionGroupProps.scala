package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOptionGroupProps {

  def apply(
    majorEngineVersion: String,
    engineName: String,
    optionConfigurations: List[_],
    optionGroupDescription: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.rds.CfnOptionGroupProps =
    (new software.amazon.awscdk.services.rds.CfnOptionGroupProps.Builder)
      .majorEngineVersion(majorEngineVersion)
      .engineName(engineName)
      .optionConfigurations(optionConfigurations.asJava)
      .optionGroupDescription(optionGroupDescription)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
