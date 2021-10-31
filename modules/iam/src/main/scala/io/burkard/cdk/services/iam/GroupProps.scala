package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GroupProps {

  def apply(
    path: Option[String] = None,
    groupName: Option[String] = None,
    managedPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.IManagedPolicy]] = None
  ): software.amazon.awscdk.services.iam.GroupProps =
    (new software.amazon.awscdk.services.iam.GroupProps.Builder)
      .path(path.orNull)
      .groupName(groupName.orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .build()
}
