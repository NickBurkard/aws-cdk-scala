package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnActivityProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty]] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnActivityProps =
    (new software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
