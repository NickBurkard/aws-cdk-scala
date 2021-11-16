package io.burkard.cdk.services.panorama

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackageProps {

  def apply(
    packageName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.panorama.CfnPackageProps =
    (new software.amazon.awscdk.services.panorama.CfnPackageProps.Builder)
      .packageName(packageName)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
