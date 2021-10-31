package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Group {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    groupName: Option[String] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.Group =
    software.amazon.awscdk.services.iam.Group.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .groupName(groupName.orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .build()
}
