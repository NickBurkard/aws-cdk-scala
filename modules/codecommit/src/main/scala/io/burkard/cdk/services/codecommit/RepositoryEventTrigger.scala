package io.burkard.cdk.services.codecommit


sealed abstract class RepositoryEventTrigger(val underlying: software.amazon.awscdk.services.codecommit.RepositoryEventTrigger)
  extends Product
    with Serializable


object RepositoryEventTrigger {
  implicit def toAws(value: RepositoryEventTrigger): software.amazon.awscdk.services.codecommit.RepositoryEventTrigger =
    Option(value).map(_.underlying).orNull

  case object All
    extends RepositoryEventTrigger(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.ALL)

  case object UpdateRef
    extends RepositoryEventTrigger(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.UPDATE_REF)

  case object CreateRef
    extends RepositoryEventTrigger(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.CREATE_REF)

  case object DeleteRef
    extends RepositoryEventTrigger(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.DELETE_REF)
}
