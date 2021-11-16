package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnActivity {

  def apply(
    internalResourceId: String,
    name: String,
    tags: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.CfnActivity =
    software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
