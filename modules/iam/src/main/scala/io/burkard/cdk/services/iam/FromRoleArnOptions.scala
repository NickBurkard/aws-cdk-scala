package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FromRoleArnOptions {

  def apply(
    mutable: Option[Boolean] = None,
    addGrantsToResources: Option[Boolean] = None
  ): software.amazon.awscdk.services.iam.FromRoleArnOptions =
    (new software.amazon.awscdk.services.iam.FromRoleArnOptions.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .addGrantsToResources(addGrantsToResources.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
