package io.burkard.cdk.services.licensemanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGrant {

  def apply(
    internalResourceId: String,
    licenseArn: Option[String] = None,
    principals: Option[List[String]] = None,
    grantName: Option[String] = None,
    allowedOperations: Option[List[String]] = None,
    status: Option[String] = None,
    homeRegion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.licensemanager.CfnGrant =
    software.amazon.awscdk.services.licensemanager.CfnGrant.Builder
      .create(stackCtx, internalResourceId)
      .licenseArn(licenseArn.orNull)
      .principals(principals.map(_.asJava).orNull)
      .grantName(grantName.orNull)
      .allowedOperations(allowedOperations.map(_.asJava).orNull)
      .status(status.orNull)
      .homeRegion(homeRegion.orNull)
      .build()
}
