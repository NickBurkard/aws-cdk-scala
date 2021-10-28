package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrantWithResourceOptions {

  def apply(
    resourceArns: Option[List[String]] = None,
    resourceSelfArns: Option[List[String]] = None,
    resource: Option[software.amazon.awscdk.services.iam.IResourceWithPolicy] = None,
    grantee: Option[software.amazon.awscdk.services.iam.IGrantable] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.GrantWithResourceOptions =
    (new software.amazon.awscdk.services.iam.GrantWithResourceOptions.Builder)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .resourceSelfArns(resourceSelfArns.map(_.asJava).orNull)
      .resource(resource.orNull)
      .grantee(grantee.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
