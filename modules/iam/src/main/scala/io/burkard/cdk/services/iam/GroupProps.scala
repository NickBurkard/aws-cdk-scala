package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
