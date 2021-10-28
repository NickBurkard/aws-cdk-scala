package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3DeployActionProps {

  def apply(
    objectKey: Option[String] = None,
    cacheControl: Option[List[_ <: software.amazon.awscdk.services.codepipeline.actions.CacheControl]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    accessControl: Option[software.amazon.awscdk.services.s3.BucketAccessControl] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    extract: Option[Boolean] = None
  ): software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps.Builder)
      .objectKey(objectKey.orNull)
      .cacheControl(cacheControl.map(_.asJava).orNull)
      .role(role.orNull)
      .accessControl(accessControl.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .bucket(bucket.orNull)
      .input(input.orNull)
      .extract(extract.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
