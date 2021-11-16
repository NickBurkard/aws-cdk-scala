package io.burkard.cdk.services.panorama

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackage {

  def apply(
    internalResourceId: String,
    packageName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.panorama.CfnPackage =
    software.amazon.awscdk.services.panorama.CfnPackage.Builder
      .create(stackCtx, internalResourceId)
      .packageName(packageName)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
