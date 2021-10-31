package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInputSecurityGroup {

  def apply(
    internalResourceId: String,
    whitelistRules: Option[List[_]] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.medialive.CfnInputSecurityGroup =
    software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .whitelistRules(whitelistRules.map(_.asJava).orNull)
      .tags(tags.orNull)
      .build()
}
