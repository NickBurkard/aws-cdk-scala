package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GitHubSourceProps {

  def apply(
    reportBuildStatus: Option[Boolean] = None,
    identifier: Option[String] = None,
    webhookFilters: Option[List[_ <: software.amazon.awscdk.services.codebuild.FilterGroup]] = None,
    branchOrRef: Option[String] = None,
    cloneDepth: Option[Number] = None,
    webhookTriggersBatchBuild: Option[Boolean] = None,
    webhook: Option[Boolean] = None,
    owner: Option[String] = None,
    repo: Option[String] = None,
    fetchSubmodules: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.GitHubSourceProps =
    (new software.amazon.awscdk.services.codebuild.GitHubSourceProps.Builder)
      .reportBuildStatus(reportBuildStatus.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .identifier(identifier.orNull)
      .webhookFilters(webhookFilters.map(_.asJava).orNull)
      .branchOrRef(branchOrRef.orNull)
      .cloneDepth(cloneDepth.orNull)
      .webhookTriggersBatchBuild(webhookTriggersBatchBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .webhook(webhook.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .owner(owner.orNull)
      .repo(repo.orNull)
      .fetchSubmodules(fetchSubmodules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
