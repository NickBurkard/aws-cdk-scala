package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOptionGroupProps {

  def apply(
    majorEngineVersion: Option[String] = None,
    engineName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    optionConfigurations: Option[List[_]] = None,
    optionGroupDescription: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnOptionGroupProps =
    (new software.amazon.awscdk.services.rds.CfnOptionGroupProps.Builder)
      .majorEngineVersion(majorEngineVersion.orNull)
      .engineName(engineName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .optionConfigurations(optionConfigurations.map(_.asJava).orNull)
      .optionGroupDescription(optionGroupDescription.orNull)
      .build()
}
