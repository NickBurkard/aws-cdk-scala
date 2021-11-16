package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataflowEndpointGroup {

  def apply(
    internalResourceId: String,
    endpointDetails: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup =
    software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.Builder
      .create(stackCtx, internalResourceId)
      .endpointDetails(endpointDetails.asJava)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
