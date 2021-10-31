package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    datasetName: Option[String] = None,
    recipeName: Option[String] = None,
    roleArn: Option[String] = None,
    sample: Option[software.amazon.awscdk.services.databrew.CfnProject.SampleProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnProject =
    software.amazon.awscdk.services.databrew.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .datasetName(datasetName.orNull)
      .recipeName(recipeName.orNull)
      .roleArn(roleArn.orNull)
      .sample(sample.orNull)
      .build()
}
