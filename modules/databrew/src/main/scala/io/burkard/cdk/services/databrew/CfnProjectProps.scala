package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    name: String,
    datasetName: String,
    recipeName: String,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sample: Option[software.amazon.awscdk.services.databrew.CfnProject.SampleProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnProjectProps =
    (new software.amazon.awscdk.services.databrew.CfnProjectProps.Builder)
      .name(name)
      .datasetName(datasetName)
      .recipeName(recipeName)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .sample(sample.orNull)
      .build()
}
