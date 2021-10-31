package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PatchSourceProperty {

  def apply(
    name: Option[String] = None,
    products: Option[List[String]] = None,
    configuration: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty =
    (new software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.Builder)
      .name(name.orNull)
      .products(products.map(_.asJava).orNull)
      .configuration(configuration.orNull)
      .build()
}
