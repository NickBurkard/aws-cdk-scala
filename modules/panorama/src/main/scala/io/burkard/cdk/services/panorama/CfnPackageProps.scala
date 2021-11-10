package io.burkard.cdk.services.panorama

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackageProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    packageName: Option[String] = None
  ): software.amazon.awscdk.services.panorama.CfnPackageProps =
    (new software.amazon.awscdk.services.panorama.CfnPackageProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .packageName(packageName.orNull)
      .build()
}
