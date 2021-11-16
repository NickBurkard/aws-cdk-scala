package io.burkard.cdk.services.datapipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParameterObjectProperty {

  def apply(
    attributes: List[_],
    id: String
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.ParameterObjectProperty.Builder)
      .attributes(attributes.asJava)
      .id(id)
      .build()
}
