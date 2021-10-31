package io.burkard.cdk.services.datapipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ParameterObjectProperty {

  def apply(
    attributes: Option[List[_]] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder)
      .attributes(attributes.map(_.asJava).orNull)
      .id(id.orNull)
      .build()
}
